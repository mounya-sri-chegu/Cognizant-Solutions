document.getElementById("registerBtn").onclick = function () {
  alert("You registered!");
};

document.getElementById("categoryFilter").onchange = function (e) {
  console.log("Selected category:", e.target.value);
};

document.getElementById("search").addEventListener("keydown", function (e) {
  console.log("Search key pressed:", e.key);
});