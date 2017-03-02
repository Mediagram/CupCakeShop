var messageContainer = document.getElementById("messageContainer");
var messageText = document.getElementById("message-text");

function showMessage(str) {

    var redText = false;
    if (str !== "")
    {   
        if (str.includes("error"))
        messageContainer.style.display = "block";

        if (redText === true) {
            messageContainer.className += " message-green";
        } else {
            messageContainer.className += " message-red";
        }

        messageText.innerHTML = str;
    }
}