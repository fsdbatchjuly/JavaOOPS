function additionOfNumbers(){
    ele1 = document.getElementById("input1")
    num1 = parseInt(ele1.value)

    ele2 = document.getElementById("input2")
    num2 =  parseInt(ele2.value)

    sum = num1 + num2;

    document.getElementById("displayLabel").innerHTML = sum;

}