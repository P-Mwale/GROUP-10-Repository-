let sentences = []
function generate() {
    var data = {
    	"start": ["#NP# #VP#."],
    	"NP": ["#Det# #N#", "#Det# #N# that #VP#", "#Det# #Adj# #N#", "#Det# #N# #Vintr#","#Det# #N# #Adj# #Ftens#"],
    	"VP": ["#Vtran# #NP#", "#Vintr#","#Vtran# #N#"],
    	"Det": ["The", "This", "That" ,"They","Mr"],
    	"N": ["John Keating", "Bob Harris","tichala son tichaka" ,"Bruce Wayne", "John Constantine", "Tony Stark", "John Wick", "Sherlock Holmes", "King Leonidas","peter parker"],
    	"Adj": ["cool", "lazy", "amazed","sad", "sweet"],
    	"Vtran": ["computes", "examines", "helps", "prefers", "sends", "plays with", "messes up with","likes"],
    	"Vintr": ["coughs", "daydreams", "whines", "slobbers", "appears", "disappears", "exists", "cries", "laughs"],
        "Vtens": ["running","walking","swiming","playing","dancing","studying","flying","driving","dinning","coding","cursing"]
    }
    
    let grammar = tracery.createGrammar(data);
    let expansion = grammar.flatten('#start#');

    sentences.push(expansion);

    printSentences(sentences);
}
function printSentences(sentences) {
    let textBox = document.getElementById("sentences");
    textBox.innerHTML = "";
    for(let i=sentences.length-1; i>=0; i--) {
        textBox.innerHTML += "<p>"+sentences[i]+"</p>"
    }
}