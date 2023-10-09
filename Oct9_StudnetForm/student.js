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
dropDownElement = document.getElementById("course")//<selectTag id="course"> </selectTag>

for (let i = 0; i < courseList.length; i++) {   
    const optionElement = document.createElement("option");
    optionElement.value = courseList[i].toLowerCase();
    optionElement.text = courseList[i];
    dropDownElement.appendChild(optionElement)    
}

function captureUserEnteredDetails(){
    
    nameInput = document.getElementById("name");
    console.log(nameInput.value)

}