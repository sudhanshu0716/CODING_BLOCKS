// Get references to the input field, submit button, and list
let data = document.getElementById("inputwala");
let submit = document.getElementById("submit");
let list = document.getElementById("list");
submit.addEventListener("click", () => {
    let abc = data.value;
    let li = document.createElement("li");
    li.innerText=abc;
    list.appendChild(li);
    data.value="";
});
