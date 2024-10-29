console.log(document.querySelector(".box").innerHTML) // Returns the HTML present in the 1st  element whose class name is box

console.log(document.querySelector(".container").innerHTML)   //Reurns the HTML present inside the class container

console.log(document.querySelector(".container").innerText)   // Returns the text present inside the container class.

console.log(document.querySelector(".container").outerHTML)  // Returns the HTML present in the container class along with container class itself.

console.log(document.querySelector(".container").tagName)  // Returns the tag name of the HTML element whose class name is container.

console.log(document.querySelector(".container").nodeName) // Returns the node name of container class.

// Here tag name and node name both is div but both have some difference that is present in the txt file.

console.log(document.querySelector(".container").textContent) //Returns all the text present inside the HTML elelment of selected element including empty space.

// document.querySelector(".container").hidden = true  // Set hidden attribute to selected element.

document.querySelector(".box").innerHTML = "Element is changed by javaScript" // HTML insid the first element whose name class name is box will be changed to "Element is changed by javaScript"

console.log(document.querySelector(".box").hasAttribute("style")) // Return false because style attribute is not ppresent in the selected element.

console.log(document.querySelector(".box").dataset)  // Return the set of data attribute.

console.log(document.querySelector(".container").classList)  // return the list of all the class name of the selectef element.
console.log(document.querySelector(".container").className)  // return the class of the selected element