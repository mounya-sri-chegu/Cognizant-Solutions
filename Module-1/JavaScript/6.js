const eventList = [];

eventList.push({ name: "Yoga Session", category: "Wellness" });

const musicEvents = eventList.filter(e => e.category === "Music");

const display = eventList.map(e => `${e.name}`);