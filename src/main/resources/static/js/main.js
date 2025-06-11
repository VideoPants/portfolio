document.addEventListener("DOMContentLoaded", () => {
    const bars = document.querySelectorAll('.skill-level');

    bars.forEach(bar => {
        const targetWidth = bar.style.width;

        bar.style.width = '0';

        setTimeout(() => {
            bar.style.width = targetWidth;
        }, 100);
    });

    console.log("Website loaded. JS is ready.");


    let lastScrollY = window.scrollY;
    const header = document.querySelector('header');

    window.addEventListener('scroll', () => {
        if (window.scrollY > lastScrollY) {
            header.style.top = "-100px";
        }

        else {
            header.style.top = "0";
        }

        lastScrollY = window.scrollY;
    });
});