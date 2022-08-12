var Fila = null
function onSubmit() {
        let DataForm = Leer()
        if (Fila == null){
            InsertarDatos(DataForm)
        } else{
            Actualizar(DataForm)
            Vaciar()
    }
}
function Leer() {
    let DataForm = {}
    DataForm["no"] = document.getElementById("no").value
    DataForm["name"] = document.getElementById("name").value
    DataForm["description"] = document.getElementById("description").value
    DataForm["price"] = document.getElementById("price").value
    return DataForm
}
function InsertarDatos(data) {
    let table = document.getElementById("tabla").getElementsByTagName('tbody')[0]
    let Fila = table.insertRow(table.length)
    columna1 = Fila.insertCell(0).innerHTML = data.no
    columna2 = Fila.insertCell(1).innerHTML = data.name
    columna3 = Fila.insertCell(2).innerHTML = data.description
    columna4 = Fila.insertCell(3).innerHTML = data.price
    columna5 = Fila.insertCell(4).innerHTML = data.age
    columna6 = Fila.insertCell(5).innerHTML = `<input class="submit" type="button" onClick="Editar(this)" value="Editar" >
                                            <input class="submit" type="button" onClick="Borrar(this)" value="Borrar" >`
    document.getElementById("nom").focus()
    Vaciar()
}
function Vaciar() {
    document.getElementById("no").value = ""
    document.getElementById("name").value = ""
    document.getElementById("description").value = ""
    document.getElementById("price").value = ""
    document.getElementById("age").value = ""
    Fila = null
}
function Editar(td) {
    Fila = td.parentElement.parentElement
    document.getElementById("no").value = Fila.cells[0].innerHTML
    document.getElementById("name").value = Fila.cells[1].innerHTML
    document.getElementById("description").value = Fila.cells[2].innerHTML
    document.getElementById("price").value = Fila.cells[3].innerHTML
    document.getElementById("age").value = Fila.cells[4].innerHTML
}
function Actualizar(DataForm) {
    Fila.cells[0].innerHTML = DataForm.no
    Fila.cells[1].innerHTML = DataForm.name
    Fila.cells[2].innerHTML = DataForm.description
    Fila.cells[1].innerHTML = DataForm.price
    Fila.cells[2].innerHTML = DataForm.age
    document.getElementById("nom").focus()
}
function Borrar(td) {
    if (confirm('¿Seguro de borrar este registro?')) {
        row = td.parentElement.parentElement
        document.getElementById("tabla").deleteRow(row.rowIndex)
        Vaciar()
    }
}
