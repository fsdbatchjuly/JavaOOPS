
console.log(localStorage.getItem("40043"))
if(localStorage.getItem("40043") == null){
    localStorage.setItem("40043","Kranthi")
}
console.log(localStorage.getItem("40043"))

console.log(localStorage.getItem("totalStudents"))
if(localStorage.getItem("totalStudents") == null){
    localStorage.setItem("totalStudents",2)
}

let obj = {rollNO:"40043",name:"Kranthi",email:"kra#gmail.com"}

if(localStorage.getItem("student") == null){
    localStorage.setItem("student",JSON.stringify(obj))
}
let arr = [obj,obj,obj,obj];
if(localStorage.getItem("people") == null){
    localStorage.setItem("people", JSON.stringify(arr))
}

fetch("http://localhost:8080/flazon_db/productsList")
    .then(response=>{
        if(!response.ok){
            throw Error("something went wrong")
        }
        return response.json();
    })
    .then(data=>{
        createProductsGrid(data);
    })
    .catch(error=>{
    })

    function createProductsGrid(data){

    //     <div class="product">
    //     <img src="product1.jpg" alt="Product 1">
    //     <h2>Product Name 1</h2>
    //     <p>Category: Category 1</p>
    //     <p>Cost: $19.99</p>
    // </div>
        gridElement = document.getElementById("product-grid")
        for(let i=0;i<data.length;i++){
            divEle = document.createElement("div")
            divEle.id = data[i].id

            imgEle = document.createElement("img")
            imgEle.src = data[i].product_Image_url; 
            imgEle.width = 150;       
            imgEle.height = 150;

            h2Elem = document.createElement("h2")
            h2Elem.innerHTML = data[i].name

            p1 = document.createElement("p")
            p1.innerHTML = "Cost $" + data[i].cost;
            
            p2 = document.createElement("p")
            p2.innerHTML = "Disount % " + data[i].discount;

            divEle.appendChild(imgEle)
            divEle.appendChild(h2Elem)
            divEle.appendChild(p1)
            divEle.appendChild(p2)

            gridElement.appendChild(divEle)

            divEle.addEventListener('click', function(event) {
                clickedId = this.id;                
                document.location.href='product_details.html?productId=' + clickedId
                
            });
    
        }
        
    }

    function moveTologin(){
        document.location.href='flazon_login.html'
    }
    

   

   