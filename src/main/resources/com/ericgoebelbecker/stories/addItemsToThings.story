
Scenario: I have a Thing and I can add items to it

Given I have a Thing with an item named foo
When I add an item named bar
Then My thing has 2 items
Then My thing has an item named bar