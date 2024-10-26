console.log("Hello World")

console.log(document.body.childNodes)
console.log(document.body.childNodes[0])   // Returns #text because of empty space between body tag and div tag.
console.log(document.body.childNodes[1])  // Returns div.container because of 1st child is #text due to empty space so div.container will be 2nd child.
console.log(document.body.childNodes[1].childNodes)  // Returns the list of child node of 2nd childnode of body.


const con = document.body.childNodes[1]  // Store all the list of child node of 2nd childnode of body.
console.log(con.firstChild)  // Returns #text due to empty space
console.log(con.lastChild)  // This also returns #text due to empty space 
console.log(con.firstElementChild)  // Returns theh first child node which is an element.
console.log(con.lastElementChild)  // Return the last child node which is an element.
con.lastElementChild.style.backgroundColor = "red"


console.log(con.parentElement)  // Returns the parent node of that element

console.log(document.body.firstElementChild.childNodes)  // Returns all the childnodes with #text, comments, etc.
console.log(document.body.firstElementChild.children)  // Returns all the element childnodes
console.log(document.body.firstElementChild.children[2].nextElementSibling)  // Returns the next element sibling of that element
console.log(document.body.firstElementChild.children[2].previousElementSibling)  // Returns previous element sibling of that element.


//  Tables

console.log(document.body.children[1].rows)  // Returns the rows of the table.
// Here from children[1] i had targeted the table from the documnnt as 1st child is container so the 2nd child is table.
console.log(document.body.children[1].columns)  // columns is undefined we have to access through rows 