createCratView()
function createCratView(){
    let cartItems = JSON.parse(localStorage.getItem("cartItems"))
tile = ``;
for (let index = 0; index < cartItems.length; index++) {
    item = cartItems[index]
    tile += `                
    <div class="item" id='tile${index}'> 
    <div class="item" style="border: 1px; border-color: blue; display: flex; margin-top: 20px;">
        <img  src="${item.product_Image_url}" width="150px" height="150px">
        <div >
            <div><label>${item.name}</label></div>
            <div><label>${item.cost}</label></div>
            <div><label>${item.discount}</label></div>
        </div>           
    </div>
    <div> <button onclick="removecartSelected(this.id)" id='${index}'>Remove from Cart</button></div>
</div>
    `    
}
document.getElementById('cart-list').innerHTML = tile

}
function removecartSelected(id){
    let cartItems = JSON.parse(localStorage.getItem("cartItems"))
    cartItems.splice(id,1)
    localStorage.setItem('cartItems',JSON.stringify(cartItems))
    document.getElementById(`tile${id}`).remove()
}





