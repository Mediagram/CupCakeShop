// Page objects
var totalPrice = 0;
var printPrice = document.getElementById("totalpris");
var selectTop = document.getElementById("selectTopping");
var selectBot = document.getElementById("selectBottom");
var addButton = document.getElementById("add-button");
var tempBasketContainer = document.getElementById("temp-basket-container");
var cakeForm = document.getElementById("cakeform");
var cakeAmount = document.getElementById("cake-amount");

// Calculate price
function calcPrice() {
    //totalPrice = 0;
    var topPrice = parseFloat(selectTop.options[selectTop.selectedIndex].dataset.price);
    var bottomPrice = parseFloat(selectBot.options[selectBot.selectedIndex].dataset.price);
    totalPrice = topPrice + bottomPrice;
    printPrice.innerHTML = totalPrice + " kr";
    console.log(cakeAmount.value);
}
selectTop.addEventListener("change", calcPrice);
selectBot.addEventListener("change", calcPrice);

// Put CupCakes in visual temp cart on shop page
function addToTempCart() {
    var combinedCupCake = selectTop.options[selectTop.selectedIndex].text + " - " + selectBot.options[selectBot.selectedIndex].text;
    tempBasketContainer.innerHTML += "<div><span>" + cakeAmount.value + " x  " + "<input type='text' value='" + combinedCupCake + "' > " + (cakeAmount.value * totalPrice) + " kr.</div>";
    printPrice.innerHTML = "0 kr.";
    cakeForm.reset();
}
addButton.addEventListener("click", addToTempCart);