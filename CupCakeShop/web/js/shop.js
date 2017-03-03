// Page objects
var totalPrice = 0;
var printPrice = document.getElementById("totalpris");
var selectTop = document.getElementById("selectTopping");
var selectBot = document.getElementById("selectBottom");
var addButton = document.getElementById("add-button");
var tempBasketContainer = document.getElementById("temp-basket-container");
var tempBasketBottom = document.getElementById("temp-basket-bottom");
var cakeForm = document.getElementById("cakeform");
var cakeAmount = document.getElementById("cake-amount");
var addToCartButton = document.getElementById("add-to-basket");
var click_count = 0;
var cupcakeFields = document.getElementsByName("cupcake-fields");
var totalSumPrice = 0;
var sumUpField = document.getElementById("sum-up-field");

// Calculate price
function calcPrice() {
    //totalPrice = 0;
    var topPrice = parseFloat(selectTop.options[selectTop.selectedIndex].dataset.price);
    var bottomPrice = parseFloat(selectBot.options[selectBot.selectedIndex].dataset.price);
    totalPrice = topPrice + bottomPrice;
    printPrice.innerHTML = totalPrice + " kr";
}
selectTop.addEventListener("change", calcPrice);
selectBot.addEventListener("change", calcPrice);

// Put CupCakes in visual temp cart on shop page
function addToTempCart() {

    // At first time click, show sum up basket and button
    if (click_count === 0) {
        tempBasketContainer.style.display = "block";
        tempBasketBottom.style.display = "block";
        addToCartButton.style.display = "block";
        click_count++;
    }

    // Get combined text
    var combinedCupCake = selectTop.options[selectTop.selectedIndex].text + " - " + selectBot.options[selectBot.selectedIndex].text;

    // Append input files dynamic
    tempBasketContainer.innerHTML += "<div><span><input type='text' name='cupcake-fields' class='cupcake-fields' value='" + cakeAmount.value + "x " + combinedCupCake + " " + (cakeAmount.value * totalPrice) + "' data-price='"+ (cakeAmount.value * totalPrice) + " kr." + "'></div>";

    // Loop over appended input fields
    for (i = 0; i < cupcakeFields.length; i++) {
        console.log(totalSumPrice += parseInt(cupcakeFields[i].dataset.price));
        sumUpField.value = totalSumPrice;
    }

    // Reset form and piece price
    printPrice.innerHTML = "0 kr.";
    cakeForm.reset();
    totalSumPrice = 0;
}
addButton.addEventListener("click", addToTempCart);