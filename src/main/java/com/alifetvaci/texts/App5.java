package com.alifetvaci.texts;

import static com.alifetvaci.texts.TextUtil.printText;

public class App5 {

    public static void main(String[] args) {
        String html = """
                      <html> \
                         <body> \
                           <p>Hello, world</p> \
                         </body> \
                      </html> \
                      """;

        printText(html);
    }
}
