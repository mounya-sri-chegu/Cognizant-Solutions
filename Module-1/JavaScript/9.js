fetch("https://jsonplaceholder.typicode.com/posts")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));

async function loadEvents() {
  const spinner = document.createElement("div");
  spinner.textContent = "Loading...";
  document.body.appendChild(spinner);

  try {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log(data);
  } catch (e) {
    console.error(e);
  } finally {
    spinner.remove();
  }
}