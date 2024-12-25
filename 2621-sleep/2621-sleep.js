/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    return new Promise(resolve => setTimeout(resolve, millis));
}
async function measureSleep(millis, iterations = 5) {
    let totalTime = 0;
    for (let i = 0; i < iterations; i++) {
        let t = Date.now();
        await sleep(millis);
        totalTime += (Date.now() - t);
    }
    console.log(`Average time: ${totalTime / iterations}ms`);
}
/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */