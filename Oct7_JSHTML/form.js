
additionOfTwoNumbers();
addOfThreeNumbers();


sampleDataType = "5.6"

//var , let, const

studentNames = ["Kranthi","harini","Shivam","Nagarjuna"];
studentNames.pop();
studentNames.push("Dinesh");

console.log(studentNames);
console.log(studentNames.indexOf("Dinesh"));

function additionOfTwoNumbers(){
    num1  = 10;
    num2 = 20;
    sum = num1 + num2;
    console.log("Addition of two numbers is ",sum);
}

function addOfThreeNumbers(){
    num1  = 10;
    num2 = 20;
    num3  = 30
    sum = num1 + num2 + num3;
    console.log("Addition of two numbers is ",sum);
}




nameVariable = "Java Class"
intVariable = 15
floatVariable = 10.56
namesArray = ["Kranthi","harini","Shivam","Nagarjuna"];
kranthiDetails = {
    name:"Kranthi",
    rollNumber:12345,
    email:"kra@gmail.com",
    age:23,
    gender:"M"
}

kranthiDetails.name = "Java Class";
console.log(kranthiDetails.name,kranthiDetails.email);

function getFulName(fName,lName){
    return fName + " This is the concatenating " + lName 
}

fullName = getFulName("Java","class");
console.log(fullName)