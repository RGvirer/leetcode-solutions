/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let accum = init;  // Start with the initial value.
    
    for (let i = 0; i < nums.length; i++) {
        accum = fn(accum, nums[i]);  // Apply the reducer function to update accum.
    }
    
    return accum;
};