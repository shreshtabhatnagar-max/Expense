const API_URL = "http://localhost:8080/api/expenses";

// Submit expense
document.getElementById("expenseForm").addEventListener("submit", function(e) {
    e.preventDefault();

    const expense = {
        title: document.getElementById("title").value,
        amount: document.getElementById("amount").value,
        category: document.getElementById("category").value,
        date: document.getElementById("date").value
    };

    fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(expense)
    })
    .then(res => res.json())
    .then(() => {
        loadExpenses();
        document.getElementById("expenseForm").reset();
    });
});

// Fetch expenses
function loadExpenses() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById("expenseList");
            list.innerHTML = "";
            data.forEach(exp => {
                const li = document.createElement("li");
                li.innerText = `${exp.title} - Rs. ${exp.amount}`;
                list.appendChild(li);
            });
        });
}

loadExpenses();
