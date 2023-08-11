export function findAllProblemToDo() {
    return fetch("http://localhost:8080/api/problems")
}

export function addProblem(id) {
    return fetch("http://localhost:8080/api/problems/init", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },      
        method: "POST",
        body: JSON.stringify({prettyId: id})
    })
}