document.addEventListener("DOMContentLoaded", () => {
    const bars = document.querySelectorAll('.skill-level');

    bars.forEach(bar => {
        const targetWidth = bar.style.width;

        bar.style.width = '0'; // reset for animation

        setTimeout(() => {
            bar.style.width = targetWidth;
        }, 100); // delay triggers animation
    });

    console.log("Website loaded. JS is ready.");
});