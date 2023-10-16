empListElement = document.getElementById("emplist");

function formEmployeesUI(empNamesList){
    for(i=0;i<empNamesList.length;i++){
        console.log("Elements are creating");
        empDiv = document.createElement("div");
        empDiv.classList.add("employee");
    
        headEle = document.createElement("h3");
        headEle.textContent = empNamesList[i].id
        p1Ele = document.createElement("p");
        p1Ele.textContent = empNamesList[i].employee_name;
        p2Ele = document.createElement("p");
        p2Ele.textContent = empNamesList[i].employee_salary
        p3Ele = document.createElement("p");
        p3Ele.textContent = empNamesList[i].employee_age
    
        empDiv.appendChild(headEle);
        empDiv.appendChild(p1Ele);
        empDiv.appendChild(p2Ele);
        empDiv.appendChild(p3Ele);
    
        empListElement.appendChild(empDiv);
    }
}



// Define the API URL you want to call
const apiUrl = 'https://dummy.restapiexample.com/api/v1/employees';

// Make a GET request to the API
fetch(apiUrl)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json(); // Assuming the response is in JSON format
  })
  .then(data => {
    console.log("Reading json respnse")
    formEmployeesUI(data.data)
  })
  .catch(error => {
    console.log("=====>This is the error Block")
    // Handle any errors that occurred during the fetch
    console.error('There was a problem with the fetch operation:', error);
  });

  

