courseList = ['Java Full Stack',
'Python Full Stack',
'Web Development',
'Testing',
'Automation Testing',
'Artificial Intelligence',
'Informatica',
'Big Data',
'Tera Data',
'Robotics',
'Angular',
'React',
'Animation',
'SQl',
'NextJJS',
'Machine Learning',
'Oracle',
'C++',
'RUBY',
];
// console.log("Script is executin");
dropDownEle = document.getElementById("course")

for(let i=0;i<courseList.length;i++){
//   console.log(i,courseList[i]);
optionElement = document.createElement("option");
optionElement.value = courseList[i].toLowerCase();
optionElement.text = courseList[i];
dropDownEle.appendChild(optionElement);
}

function onSubmitClick(){
nameEle = document.getElementById("name");
console.log(nameEle.value);

emailEle = document.getElementById("email");
console.log(emailEle.value);

ageEle = document.getElementById("age");
console.log(ageEle.value);
}


// const apiUrl = 'http://localhost:8080/api/courses/getAllCourses';


// // Use the fetch function to make a GET request
// fetch(apiUrl)
//   .then(response => {
//     // Check if the response status code indicates success (e.g., 200 OK)
//     if (!response.ok) {
//       throw new Error(`HTTP error! Status: ${response.status}`);
//     }
//     // Parse the response body as JSON
//     return response.json();
//   })
//   .then(data => {
//     // Handle the JSON data from the API
//     console.log(data);
//     // You can update the DOM or perform other actions here
//   })
//   .catch(error => {
//     // Handle any errors that occurred during the fetch
//     console.error('Fetch error:', error);
//   });