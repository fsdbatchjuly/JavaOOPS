/* <select id="course" name="course" required>
<option value="Math">Math</option>
<option value="Science">Science</option>
<option value="History">History</option>
<option value="English">English</option>
</select> */

fetch("http://localhost:8080/api/courses/getAllCourses")
    .then(response => {
        if(!response.ok){
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        return response.json();
    })
    .then(data => {
        console.log(data);
        createCoursesOptions(data)
    })
    .catch(error=>{
        console.log(error)
    })

fetch("http://localhost:8080/api/courses/getAllFaculty")
    .then(response=>{
        if(!response.ok){
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        return response.json();
    })
    .then( data=>{
        createFacutlyOptions(data)
    })

function createCoursesOptions(data) {
    
    dropDownEle = document.getElementById("course")

    for(let i=0; i<data.length; i++){
        option = document.createElement("option")
        option.value = data[i].courseId
        option.text = data[i].name
        dropDownEle.appendChild(option)
    }


}

function createFacutlyOptions(data) {
    
    dropDownEle = document.getElementById("faculty")

    for(let i=0; i<data.length; i++){
        option = document.createElement("option")
        option.value = data[i].name
        option.text = data[i].name
        dropDownEle.appendChild(option)
    }


}

