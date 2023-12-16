console.log("Fetch Started")
fetch("http://localhost:8080/flazon_db/productsList")
    .then(response=>{
        console.log("First Then")
        if(!response.ok){
            throw Error("something went wrong")
        }        
        return response.json();        
    })
    .then(data=>{
        console.log("Second Then")
    })
    .catch(error=>{
        console.log("Error")
    })

    console.log("Fetch Ended")
