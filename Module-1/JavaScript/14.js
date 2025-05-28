$("#registerBtn").click(function () {
  alert("Registered with jQuery");
});

$(".eventCard").fadeIn();
setTimeout(() => {
  $(".eventCard").fadeOut();
}, 2000);