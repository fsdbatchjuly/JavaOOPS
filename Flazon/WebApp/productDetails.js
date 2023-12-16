
if(!window.cartArray != undefined){
    window.cartArray = []
}
let productInfo;
getIdFromURL()

function getIdFromURL() {
    const urlParams = new URLSearchParams(window.location.search);    
    valueFromURL = urlParams.get('productId')
    url = "http://localhost:8080/flazon_db/productsList/" + valueFromURL
    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw Error("something went wrong")
            }
            return response.json();
        })
        .then(data => {
            formDetailUI(data);
        })
        .catch(error => {
        })
}


function formDetailUI(data) {
    productInfo = data
    imgElement = document.getElementById("image")
    imgElement.src = data.product_Image_url;

    nameElement = document.getElementById("name")
    nameElement.innerHTML = data.name

    costElement = document.getElementById("cost")
    costElement.innerHTML = "&#8377; " + data.cost

    discountElement = document.getElementById("discount")
    discountElement.innerHTML = data.discount + "%"

}

function addItemtoCart(){    
    //we are getting items List from local storage
    let cartItems =  JSON.parse(localStorage.getItem("cartItems"))    

    //If Items List is null
    if(cartItems == null){
        let arr = [productInfo];
        //Create Items List and save in local storage
        localStorage.setItem("cartItems",JSON.stringify(arr))
    }else{
        cartItems.push(productInfo)
        localStorage.setItem("cartItems",JSON.stringify(cartItems))
    }
}