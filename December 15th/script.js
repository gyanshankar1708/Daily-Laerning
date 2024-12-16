let button = document.getElementById("btn")
let previous = "Hello I am the content"
button.addEventListener("click",()=>{
    document.querySelector(".item").innerHTML = "I am new content."
})
button.addEventListener("dblclick",()=>{
    alert("You have clicked twice")
})
button.addEventListener("mouseover",()=>{
    var pervious = document.querySelector(".item")
    document.querySelector(".item").innerHTML = "You are hovering"
})
button.addEventListener("mouseleave",()=>{
    document.querySelector(".item").innerHTML = previous
})
button.addEventListener("contextmenu",()=>{
    alert("Right click is not allowed")
})