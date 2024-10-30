function cardGenerate(imgurl, title, cName, month, views, timespan) {
  let total = "";
  if (views < 1000) {
    total = views.toString();
  } else if (views < 1000000) {
    total = (views / 1000).toString() + "K";
  } else {
    total = (views / 1000000).toString() + "M";
  }
  let html = `<div class="box">
            <div class="image">
                <img src="${imgurl}"
                    alt="">
                <div class="timespan">${timespan}</div>
            </div>
            <div class="second">
                <div class="title">
                    ${title}
                </div>
                <div class="info">
                    <ul>
                        <li>${cName}</li>
                        <li>${total} views</li>
                        <li>${month} months ago</li>
                    </ul>
                </div>
            </div>
        </div>`;
    let con = document.querySelector(".container");
    con.insertAdjacentHTML("beforeend",html)
}


function clickhere(){
    cardGenerate("https://cdn.pixabay.com/photo/2022/05/17/02/11/fractal-7201481_640.jpg","Testing my javaScript code","Happy world",5,2000000,"12:15")
}