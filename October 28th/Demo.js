console.log("Hello World")

// let boxes = document.getElementsByClassName("box")
// boxes[2].style.backgroundColor = "red"  // Changes background color to red the 3rd box whose class name is box.

// let red = document.getElementById("red")
// red.style.backgroundColor = "red"  // Changes background color to red whose id name is red

// document.querySelector(".box").style.backgroundColor = "yellow" // Only select the 1st element whose class name is box and changes background color to yellow.

// document.querySelector("#red").style.backgroundColor = "green" // Select whose id name is red and change background color to green.

let boxes = document.querySelectorAll(".box")  // Retruns all the elements whose class name is box as HTML collection.
boxes.forEach(e=>{
    e.style.backgroundColor = "pink"
})

let val = document.getElementById("red")
console.log(val.matches("#red"))
console.log(val.closest(".container"))
console.log(document.querySelector(".container").contains(boxes[3]))