---
title: 建造者模式
tag: 设计模式
categories: 设计模式
---

# Builder模式（建造者模式）

>  大都市中林立者许多高楼大厦，这些高楼大厦都是具有建筑结构的大型建筑。通常，建筑和构建这种具有建筑结构的大型物体在英文中称为Build。
>
> 在建造大楼时，需要先打牢地基，搭建框架，然后自下而上地一层一层盖起来。通常，在建造这种具有复杂结构的物体时，很难一气呵成。我们需要首先建造组成这个物体的各个部分，然后分阶段将它们组装起来。

## 示例类图

> ![image-20220822140822402](BuilderPattern/image-20220822140822402.png)

## 示例程序

> ### Builder类
>
> Builder类是一个声明了编写文档的方法的抽象类。makeTitle、makeString、makeItems方法分别是编写标题、字符串、条目的方法。close方法是完成文档编写的方法。
>
> ```java
> public abstract class Builder {
>     /**
>      * 编写标题
>      * @param title 标题
>      */
>     public abstract void makeTitle(String title);
> 
>     /**
>      * 编写字符串
>      * @param str 字符串
>      */
>     public abstract void makeString(String str);
> 
>     /**
>      * 编写条目
>      * @param items 条目
>      */
>     public abstract void makeItems(String[] items);
> 
>     /**
>      * 完成文档编写
>      */
>     public abstract void close();
> }
> ```
>
> ### Director 类
>
> Director类使用 Builder 类中声明的方法来编写文档。
>
> Director类的构造函数的参数是Builder类型的。但是实际上我们并不会讲Builder类的实例作为参数传递给Director类。这是因为Builder类是抽象类，是无法生成其实例的。实际上传递给Director类的是Builder类的子类（即后面会讲到的TextBuilder类和HTMLBuilder类）的实例。而是这些Builder类的子类决定了编写出的文档的形式。
>
> construct方法是编写文档的方法。调用这个方法后就会编写文档。construct方法中所使用的方法都是在Builder类中声明的方法（construct的意思是“构建”）。
>
> ```java
> public class Director {
>     private Builder builder;
> 
>     public Director(Builder builder) {
>         this.builder = builder;
>     }
> 
>     public void construct() {
>         builder.makeTitle("Greeting");
>         builder.makeString("从早上至下午");
>         builder.makeItems(new String[]{
>                 "早上好。",
>                 "下午好。"
>         });
>         builder.makeString("晚上");
>         builder.makeItems(new String[]{
>                 "晚上好。",
>                 "晚安。",
>                 "再见。"
>         });
>         builder.close();
>     }
> }
> ```
>
> ### TextBuilder类
>
> TextBuilder类是Builder类的子类，它的功能是使用纯文本编写文档，并以String返回结果。
>
> ```java
> public class TextBuilder extends Builder{
>     private StringBuffer buffer = new StringBuffer();
> 
>     /**
>      * 编写标题
>      * @param title 标题
>      */
>     @Override
>     public void makeTitle(String title) {
>         buffer.append("==========================\n");
>         buffer.append("「" + title + "」");
>         buffer.append("\n");
>     }
> 
>     /**
>      * 编写字符串
>      * @param str 字符串
>      */
>     @Override
>     public void makeString(String str) {
>         buffer.append("◼︎" + str + "\n");
>         buffer.append("\n");
>     }
> 
>     /**
>      * 编写条目
>      * @param items 条目
>      */
>     @Override
>     public void makeItems(String[] items) {
>         for (int i = 0; i < items.length; i++) {
>             buffer.append("·" + items[i] + "\n");
>         }
>         buffer.append("\n");
>     }
> 
>     /**
>      * 完成文档编写
>      */
>     @Override
>     public void close() {
>         buffer.append("==========================\n");
>     }
> 
>     /**
>      * 完成的文档
>      * @return String
>      */
>     public String getResult() {
>         return buffer.toString();
>     }
> }
> ```
>
> ### HTMLBuilder类
>
> HTMLBuilder类也是Builder类的子类，它的功能是使用HTML编写文档，其返回结果是HTML文件的名字。
>
> ```java
> public class HTMLBuilder extends Builder{
>     /**
>      * 文件名
>      */
>     private String filename;
>     /**
>      * 用于编写文件的 PrintWriter
>      */
>     private PrintWriter writer;
> 
>     /**
>      * 编写标题
>      * @param title 标题
>      */
>     @Override
>     public void makeTitle(String title) {
>         // 标题作为文件名
>         filename = title + ".html";
>         try {
>             // 生成 PrintWriter
>             writer = new PrintWriter(new FileWriter(filename));
>         } catch (IOException e) {
>             e.printStackTrace();
>         }
>         writer.println("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
>         writer.println("<title>" + title + "</title></head><body>");
>         writer.println("<h1>" + title + "</h1>");
>     }
> 
>     /**
>      * HTML 文件中输出的字符串
>      * 用<p>标签输出
>      * @param str 字符串
>      */
>     @Override
>     public void makeString(String str) {
>         writer.println("<p>" + str + "</p>");
>     }
> 
>     /**
>      * HTML 文件中的条目
>      * 用 <ul> 和 <li> 输出
>      * @param items 字符串数组
>      */
>     @Override
>     public void makeItems(String[] items) {
>         writer.println("<ul>");
>         for (int i = 0; i < items.length; i++) {
>             writer.println("<li>" + items[i] + "</li>");
>         }
>         writer.println("</ul>");
>     }
> 
>     /**
>      * 完成文档
>      * 关闭标签
>      * 关闭文件
>      */
>     @Override
>     public void close() {
>         writer.println("</body></html>");
>         writer.close();
>     }
> 
>     /**
>      * 编写完成的文档
>      * 返回文件名
>      * @return 文件名
>      */
>     public String getResult(){
>         return filename;
>     }
> }
> ```
>
> ### Main类
>
> Main类是Builder模式的测试程序。我们可以使用如下命令编写相应格式的文档：
>
> - java Main plain：编写纯文本文档
> - java Main html：编写html格式的文档
>
> 当我们在执行命令中指定参数为plain的时候，会将TextBuilder类的实例作为参数传递至Director类的构造函数中；而若是在命令行中指定参数为html的时候，则会将HTMLBuilder类的实例作为参数传递至Director类的构造函数中。
>
> 由于TextBuilder和HTMLBuilder都是Builder的子类，因此Director仅仅使用Builder的方法即可编写文档。也就是说，Director并不关心实际编写文档的到底是TextBuilder还是HTMLBuilder。
>
> 正因为如此，我们必须Builder中声明足够多的方法，以实现编写文档的功能，但并不包括TextBuilder和HTMLBuilder中持有的方法。
>
> ```java
> public class Main {
>     public static void main(String[] args) {
>         if (args.length != 1) {
>             usage();
>             System.exit(0);
>         }
>         if (args[0].equals("plain")) {
>             TextBuilder textBuilder = new TextBuilder();
>             Director director = new Director(textBuilder);
>             director.construct();
>             String result = textBuilder.getResult();
>             System.out.println(result);
>         } else if (args[0].equals("html")) {
>             HTMLBuilder htmlBuilder = new HTMLBuilder();
>             Director director = new Director(htmlBuilder);
>             director.construct();
>             String filename = htmlBuilder.getResult();
>             System.out.println(filename + "文件编写完成。");
>         } else {
>             usage();
>             System.exit(0);
>         }
>     }
>     public static void usage(){
>         System.out.println("Usage: java Main Plain     编写纯文本文档");
>         System.out.println("Usage: java Main HTML      编写纯HTML文档");
>     }
> }
> ```

## Builder模式中的登场角色

- Builder（建造者）

  > Builder角色负责定义用于生成实例的接口（API）。Builder角色中准备了用于生成实例的方法。
  >
  > 在示例程序中，由Builder类扮演此角色。

- ConcreteBuilder（具体的建造者）

  > ConcreteBuilder角色是负责实现Builder角色的接口的类（API）。这里定义了在生成实例时实际被调用的方法。此外，在ConcreteBuilder角色中还定义了获取最终生成结果的方法。
  >
  > 在示例程序中，由TextBuilder类和HTMLBuilder类扮演此角色。

- Director（监工）

  > Director角色负责使用Builder角色的接口（API）来生成实例。它并不依赖于ConcreteBuilder角色。为了确保不论ConcreteBuilder角色是如何被定义的，Director角色都能正常工作，它**只调用在Builder角色中被定义的方法**。
  >
  > 在示例程序中，由Director类扮演此角色。

- Client（使用者）

  > 该角色使用了Builder模式。
  >
  > 在示例程序中，在Main类扮演此角色。

### Builder模式类图

> ![image-20220822144943377](BuilderPattern/image-20220822144943377.png)

### Builder模式时序图

> ![image-20220822145220971](BuilderPattern/image-20220822145220971.png)

## 思路要点

- ### **谁知道什么**

  > 在面向对象编程中，“谁知道什么”是非常重要的。也就是说，我们需要在编程时注意哪个类可以使用哪个方法以及使用这个方法到底好不好。
  >
  > Main类并不知道（没有调用）Builder类，它只是调用了Direct类的construct方法。这样，Director类就会开始工作（Main类对此一无所知），并完成文档的编写。
  >
  > 另一方面，Director类知道Builder类，它调用Builder类的方法来编写文档，但是它并不知道它“真正”使用的是哪个类。也就是说它并不知道它所使用的类到底是TextBuilder类、HTMLBuilder类还是其他Builder类的子类。不过也没有必要知道，因为Director类只使用了Builder类的方法，而Builder类的子类都已经实现了哪些方法。
  >
  > Director类不知道自己使用的究竟是Builder类的那个子类也好。这是因为**“只有不知道子类才能替换”**。不论是将TextBuilder的示例传递给Director，还是将HTMLBuilder类的实例传递给Director，它都可以正常工作，原因正是Director类不知道Builder类的具体子类。
  >
  > 正是因为不知道才能够替换，正是因为可以替换，组建才具有高价值。作为设计人员我们必须是个关注这种**“可替换性”**。

- ### **设计时能够决定的事情和不能决定的事情**

  > 在Builder类中，需要声明编辑文档（实现功能）所必需的所有方法。Director类中使用的方法都是Builder类提供的。因此，在Builder类中应当应以哪些方法是非常重要的。
  >
  > 而且，Builder类还必需能够应对将来子类可能增加的需求。在示例程序中，我们只编写了支持纯文本文档的子类和支持HTML文件的子类。但是将来可能还会希望能够编写其他形式（例如XXXX形式）的文档。那时候，到底能不能编写出支持XXXX形式的XXXXBuilder类呢？应该不需要新的方法吧？
  >
  > 虽然类的设计者并不是神仙，他们无法准确的预测到将来可能发生的变化。但是，我们还是有不要让设计出的类能够尽可能灵活的应对近期可能发生的变化。

- ### **代码的阅读方法和修改方法**

  > 在编程时，虽然有时需要从零开始编写代码，但更对时候我们都是在现有代码的基础上进行增加和修改。
  >
  > 这时，我们需要先阅读现有代码。不过，只是阅读抽象类的代码时无法获取很多信息的（虽然可以从方法名中获得线索）。
  >
  > 让我们再回顾一下示例程序。即使理解了Builder抽象类，也无法理解程序整体。至少必须阅读了Director的代码后才能理解Builder类的使用方法（Builder类的方法和调用方法）。然后再去看看TextBuilder类和HTMLBuilder类的代码，就可以明白调用Builder类的方法后具体会进行什么样的处理。
  >
  > 如果没有理解各个的角色就动手增加和修改代码，在判断到底应该修改哪个类时，就会很容易出错。例如，如果修改Builder类，那么就会对Director类中调用Builder类方法的地方和Builder类的子类产生影响。或是如果不小心修改了Director，在其内部调用了TextBuilder类的特有的方法，则会导致其失去作为可服用组件的独立性，而且当将子类替换为HTMLBuilder时，程序可能会无法正常工作。

## 所学知识

> 学习了用于组装具有复杂结构的实例的Builder模式。组长的具体过程则被隐藏在Director角色中。