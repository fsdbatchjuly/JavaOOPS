
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
            console.log(data)
            formDetailUI(data);
        })
        .catch(error => {
            console.log(error)
        })
}


function formDetailUI(data) {
    imgElement = document.getElementById("image")
    imgElement.src = data.product_Image_url;

    nameElement = document.getElementById("name")
    nameElement.innerHTML = data.name

    costElement = document.getElementById("cost")
    costElement.innerHTML = "&#8377; " + data.cost

    discountElement = document.getElementById("discount")
    discountElement.innerHTML = data.discount + "%"

}