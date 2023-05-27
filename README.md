# The Big Intro
- 👋 Hi, I’m @jamaralll
<!---
jamaralll/jamaralll is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->

# Description / Rationale

What's this Repo about?  Julia and caco exploring the basics of Computer Science!


## Daily grind

*Julia checkout ->* https://markdownguide.org/cheat-sheet

### MArkdown use case
1. Documentation
2. Simple Documentation
3. Quick Documentation next to your code


### Shell prompt
# If running interactively, then:
if [ "$PS1" ]; then

    eval `dircolors`
    set -o vi

    # PROMPT
    COLOR1="\[\033[0;36m\]"
    COLOR2="\[\033[1;32m\]"
    COLOR3="\[\033[1;36m\]"
    COLOR4="\[\033[0;17m\]"
    PROMPT=">>"
    if [ "$UID" = "0" ];
    then
        COLOR2="\[\033[1;31m\]"
        PROMPT="\\$"
    fi
    #PS1="\n\[\033]0;\h: \w\007$COLOR2[$COLOR1\u@\h$COLOR2:$COLOR3\w$COLOR2]-[$COLOR1\d \@$COLOR2]\n$PROMPT$COLOR4 "
    PS1="\033]0;\h: \w\007$COLOR2[$COLOR1\u@\h$COLOR2:$COLOR3\w$COLOR2]-[$COLOR1\d \@$COLOR2]\n$PROMPT$COLOR4 "
fi

Try it!!!


### Todos
1. ~finish installing OpenJDK. 
It's already downloaded, You just had to set your .zshrc and .bash_profile, then test by executing java --version.~
2. ~On JDK is working, open the .java file in VS code and hit run, see if you get it to print the date~
3. After that modify your code, to calculate the age correctly taking into account day and month
4. Finish Addition class (Adriana's)
5. Write a Modulus function
6. Write number sequences (1..100), even(1-100), odd(1-100), divisibleby5(1-100), comma delimited, pipe delimited, to 500?
7. Fibonacci sequence
8. Objects introduction?
