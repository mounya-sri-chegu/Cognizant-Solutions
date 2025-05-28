const userData = {
  name: "Harika",
  email: "harika@example.com"
};

setTimeout(() => {
  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(userData),
    headers: { "Content-type": "application/json" }
  })
    .then(res => res.json())
    .then(data => alert("Registration successful"))
    .catch(() => alert("Submission failed"));
}, 2000);