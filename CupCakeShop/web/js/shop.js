// Page objects
var totalPrice = 0;
var printPrice = document.getElementById("totalpris");
var selectTop = document.getElementById("selectTopping");
var selectBot = document.getElementById("selectBottom");
var addButton = document.getElementById("add-button");

// Calculate price
function calcPrice() {
    totalPrice = 0;
    totalPrice += parseFloat(selectTop.options[selectTop.selectedIndex].dataset.price);
    totalPrice += parseFloat(selectBot.options[selectBot.selectedIndex].dataset.price);
    printPrice.innerHTML = totalPrice + " kr";
}
selectTop.addEventListener("change", calcPrice);
selectBot.addEventListener("change", calcPrice);

// Put CupCakes in visual temp cart on shop page
function addToTempCart() {
    console.log("item");
}
addButton.addEventListener("click", addToTempCart);