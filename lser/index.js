import{loadLaunches, loadPatches, getPatch} from "./rest.js"

console.log("index.js aufgerufen")

const start = async e =>{
    console.log("body: ", body)
    render()
}

async function render(){
    const launches = await loadLaunches()
    const patches = await loadPatches()
    const body = document.getElementById("body")

    body.innerHTML=""
    launches.forEach(launch => {
        const row = body.insertRow()
        row.innerHTML = `
            <td>${launch.flight_number}</td>
            <td>${launch.name}</td>
            <td>${launch.date_utc}</td>
            <td>${launch.patch_id}</td>
        
        `
        //patches und launches können geladen werden, hatte aber keine Zeit mehr die patches des launches anzuzeigen
    })
}
window.onload = start;