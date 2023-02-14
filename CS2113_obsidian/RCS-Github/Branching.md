Personally, I'd say this is the hardest part of github, having the ability to branch makes life much worse, however the usability is pretty much endless

From a more defined perspective, branching is the **process of evolving multiple versions of the software in parallel**. For example, one team member can create a new branch and add an experimental feature to it.

The branches **can be merged with each other**, what this means is that once a change is made they can be merged with each other. This usually creates a new commit, **often called the merge commit**. Again this is if you turn off [[fast forwarding]]. This is perhaps for a different day

Merge conflicts happen when you try to merge 2 branches that had changed the same **part of the code**. In these cases you would need to resolve these effectively

**the HEAD label indicates which branch you are on**

```git
on branch master

```

This command doesnt work, as this only works on the CLI, need to find an alternative command.

The easier method is to use `git branch`, this will list all the branches, with an asterisk for the branch you are on.

# Create Branches
To create a branch, just use 
```
git branch <branch_name>
```

Then to move to that branch just use

```
git checkout <branch_name>
```

You can do both at the same time,
```
git checkout -b <branch_name>
```

# The whole process
I think this one is pretty clear, but what you need to keep track off is this concept of **fast forwarding**, more on that in a bit.

Ideally create a new branch and end up creating certain commits, but at the end of the day, what you need to do is not cause any merges

If you have fast forwarding enabled, some changes happen. Let us say you have the master branch and a new feature branch. If you make changes in the feature branch, if fast forwarding is on, then this change would communicate itself to the master branch too, with no control from you. So even if git is auto adding the right data to master, you can still try to do certain things to make life easier. You can use what is called a no fast forwarding merge to ensure that this branch doesnt merge with the others.

For instance, this is what this could look like:
```java
git merge --no-ff add-countries
```

For effect, its best if you can try to see how this works, in teh DukeException package and play around to find out what can be done.


## You can push branches

Some explanation:
- git push origin master pushes the master branch to the repo named origin. This in its own right is branch pushing
- git push upstream-rpo add intro pushes the add-intro branch onto upstream repo
If youre pushing a branch you just made locally, need to use:

```
git push -u origin <name_of_branch>


```