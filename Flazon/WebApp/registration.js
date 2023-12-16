function moveToLogin() {
    window.location.href = "flazon_login.html"
}

function captureSignUpFormDetails() {
    nameField = document.getElementById('name');
    emailFiled = document.getElementById('email');
    addressFiled = document.getElementById('address');
    phoneField = document.getElementById('phone');
    ageField = document.getElementById('age');
    genderField = document.getElementById('gender');
    passwordField = document.getElementById('password');
     userName = nameField.value + '_' + nameField.value
    console.log(nameField.value, emailFiled.value, addressFiled.value, phoneField.value, ageField.value, genderField.value, emailFiled.value)
    createUserInDataBase(nameField.value,emailFiled.value,'M',parseInt(ageField.value),passwordField.value,userName,phoneField.value,addressFiled.value)

}
function createUserInDataBase(name,email,gender,age,password,user_name,phone_number,address) {

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    
    var raw = JSON.stringify({                
                name: name,
                email: email,
                gender: gender,
                age: age,
                password: password,
                user_name: user_name,
                phone_number: phone_number,
                address: address
    });
    
    var requestOptions = {
      method: 'POST',
      headers: myHeaders,
      body: raw,
      redirect: 'follow'
    };
    
    fetch("http://localhost:8080/flazon_db/create", requestOptions)
      .then(response => response.text())
      .then(result => {
        window.alert('user created successfully')
        console.log(result)
        window.location.href = 'flazon_login.html'
    })
      .catch(error => console.log('error', error));
}

document.getElementById('myForm').addEventListener('submit', function (event) {
    event.preventDefault();
    console.log('Form submitted without page refresh. Now you can handle it with your custom logic.');
})


