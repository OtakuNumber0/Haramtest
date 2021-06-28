const url = "http://localhost:8080"

export async function loadLaunches(){
    const response= await fetch(url+"/launches")
const launches=await response.json();
return launches;
}
export async function loadPatches(){
    const response= await fetch(url+"/patches")
    const patches= await response.json();
    return patches;
}
export async function getPatch(id){
    const response= await fetch(url+"/patches/"+id)
    const patch= response.text;
    return patch;
}