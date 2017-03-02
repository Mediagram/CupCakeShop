var messageContainer = document.getElementById("messageContainer");
var messageText = document.getElementById("message-text");

var hiddenMessage = document.getElementById("hiddenMessage").innerHTML;

function showMessage() {

    var redText = false;

    if (hiddenMessage !== "") {
        if (hiddenMessage.includes("error"))
            //messageContainer.style.display = "block";
            setTimeout(function () {
                messageContainer.className += " fade-down";
            }, 100);

        if (redText === true) {
            messageContainer.className += " message-green";

        } else {
            messageContainer.className += " message-red";
        }

        messageText.innerHTML = hiddenMessage;
    }


    setTimeout(function () {
        messageContainer.className += " fade-out";
    }, 3000);


}