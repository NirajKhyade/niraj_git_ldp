import { RobotEyes, RobotHands, Dependencies } from './shoppingRobot';


context('Search Test', () => {
    const robotEyes = new RobotEyes();
    const robotHands = new RobotHands();
    //const dependencies = new Dependencies()

    describe('Shopping Cart ', () => {

        

        it("fixture file ", function () {
            cy.fixture('testdata.json').then((testData) => {
                cy.visit(testData.url)
            })
        })
        it("Add Items To Cart ", () => {
            robotHands.addToCart()
            robotEyes.seesCartPage()
            robotHands.clickOnCrossButton()
          
            
        });

        it("Filter Items By Size", () => {
            robotHands.clickOnSizeM();
            robotEyes.seesSizeM();
            robotHands.clickOnSizeM();
            robotHands.clickOnSizeXS();
            robotEyes.seesSizeXS();
            robotHands.clickOnSizeXS();
            robotHands.clickOnSizeXL();
            robotEyes.seesSizeXL();
            robotHands.clickOnSizeXL();
        });
        it("Increase Items's Quantity By 1", () => {
            robotHands.clickOnCart();
            robotHands.increaseQuantity();
        });
        it("Verify Prize ", () => {
            robotEyes.seesPrice();
        });
        it("Verify Checkout Prize", () => {
            robotHands.clickCheckOut();
            //cy.reload();
        });



        

    });


});