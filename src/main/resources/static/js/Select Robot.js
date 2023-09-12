
/* Add these configurations to your `tailwind.config.js` file. */

const plugin = require('tailwindcss/plugin');

/** @type {import("https://cdn.skypack.dev/tailwindcss@3.3.1").Config} */
module.exports = {
  variants: {
    // Define a custom variant for `textColor` called `invalid`
    textColor: ({ after }) => after(['invalid']),
  },
  plugins: [
    // Define a custom variant for `invalid` that targets `:invalid` pseudo-class
    plugin(function ({ addVariant, e }) {
      addVariant('invalid', ({ modifySelectors, separator }) => {
        modifySelectors(({ className }) => {
          return `.${e(`invalid${separator}${className}`)}:invalid`;
        });
      });
    }),
  ],
};