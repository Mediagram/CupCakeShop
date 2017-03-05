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
var tempBasketForm = document.getElementById("tempBasketForm");
var headerBalance = document.getElementById("header-balance");

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
    var combinedCupCake = selectTop.options[selectTop.selectedIndex].text + "-" + selectBot.options[selectBot.selectedIndex].text;
    
    if (!combinedCupCake.inludes("Select"))
    {
        // Append input files dynamic
        tempBasketContainer.innerHTML += "<div><input type='text' name='cupcake-fields' class='cupcake-fields' value='" + cakeAmount.value + "x " + combinedCupCake + " " + (cakeAmount.value * totalPrice) + " kr." + "' data-price='" + (cakeAmount.value * totalPrice) + "'></div>";
        //console.log(tempBasketContainer.innerHTML);

        totalSumPrice += (cakeAmount.value * totalPrice);
        sumUpField.value = totalSumPrice;

        // Reset form and piece price
        printPrice.innerHTML = "0 kr.";
        cakeForm.reset();
    }
    else
    {
        alert('Select a topping and/or bottom!');
    }
}

addButton.addEventListener("click", addToTempCart);

tempBasketForm.onsubmit = function () {

    if (parseInt(headerBalance.innerHTML) < sumUpField.value) {
        alert('You have insufficient money!');
        return false;
    }

};
