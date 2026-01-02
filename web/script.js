function calculate() {

    const data = {
        from: document.getElementById("from").value,
        to: document.getElementById("to").value,
        date: document.getElementById("date").value
    };

    fetch("http://localhost:8080/price", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    })
        .then(res => res.json())
        .then(result => {
            document.getElementById("result").innerText =
                "Distance: " + result.distance + " km | Price: " + result.price + " KZT";
        });
}
