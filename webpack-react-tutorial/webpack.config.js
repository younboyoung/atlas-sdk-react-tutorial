const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
module.exports = {
    entry: "./src/index.js",
    output: {
        path: path.resolve(__dirname, "../src/main/resources/js"),
        filename: "tutorial-atlaskit-screen.js",
        //publicPath : '/dist'
    },
    module: {
        rules: [{
            test: /\.js$/,
            exclude: /node_modules/,
            use: {
                loader: "babel-loader",
                //loader: 'file-loader',
/*                options: {
                    plugins: ['react-hot-loader/babel'],
                },*/
            },
        }]
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: "./src/index.html"
        })
    ]
}