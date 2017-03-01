var messageContainer = document.getElementById("messageContainer");
var messageText = document.getElementById("message-text");

function showMessage(a, b) {
    
    messageContainer.style.display = "block";
    
    if (b === true) {
        messageContainer.className += " message-green";
    } else {
        messageContainer.className += " message-red";
    }
    
    messageText.innerHTML = a;
}