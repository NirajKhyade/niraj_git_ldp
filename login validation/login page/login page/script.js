const validationUsername = 'niraj@test.com';
const validationPassword = 'niraj@123';

const login = document.querySelector('#login');
var username = document.querySelector('#userName');
var password = document.querySelector('#password');
let message = document.getElementById('message');
let btnId = document.getElementById('submitBtnLog');

login.addEventListener('submit', (e) => {
    e.preventDefault()

    // console.log(username.value);
    // console.log(password.value);
    if (username.value != '' && password.value != '') {
        if (username.value == validationUsername && password.value == validationPassword) {
            message.textContent = 'Logged in successfully!'
            // btnId.ariaDisabled;
            message.style.color = "#00FF00";
            window.open('successful.html');
        }
        else {
            message.textContent = 'Username or password may be wrong.'
            message.style.color = "#FF0000";
        }
    }
    else {
        //alert('blank');
        message.textContent = 'All feilds are mandatory to be filled.';
        message.style.color = "#FF0000";
    }

});


