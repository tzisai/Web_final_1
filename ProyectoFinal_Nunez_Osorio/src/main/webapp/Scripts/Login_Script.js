/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function mostrarLogin() {
    document.getElementById("Login_Container").style.display = "block";
};

function cerrarLogin() {
    document.getElementById("Login_Container").style.display = "none";
};

// Opcional: cerrar el popup al hacer clic fuera del formulario
window.onclick = function(event) {
    const modal = document.getElementById("Login_Container");
    if (event.target === modal) {
        modal.style.display = "none";
    }
};