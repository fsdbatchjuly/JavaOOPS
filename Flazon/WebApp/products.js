fetch("http://localhost:8080/flazon_db/productsList")
    .then(response=>{
        if(!response.ok){
            throw Error("something went wrog")
        }
        return response.json();
    })
    .then(data=>{
        console.log(data)
    })
    .catch(error=>{
        console.log(error)
    })