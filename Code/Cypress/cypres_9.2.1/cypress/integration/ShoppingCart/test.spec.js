import { RobotEyes, RobotHands, Dependencies } from './shoppingRobot';
let add= "(//button[@class='sc-124al1g-0 jCsgpZ'])"


context('Search Test', () => {
    const robotEyes = new RobotEyes();
    const robotHands = new RobotHands();
    //const dependencies = new Dependencies()

    describe('Shopping Cart ', () => {
        it("Visit Shopping Cart Site ", function () {
            cy.fixture('testdata.json').then((testData) => {
                cy.visit(testData.url)
            })
        })
        it("Add Items To Cart ", () => {
            cy.xpath(add+'[1]').click()    
           //cy.xpath("(//button[@class='sc-124al1g-0 jCsgpZ'])[7]").click()    
            //robotHands.addToCart()
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
        it("Verify Checkout Prize", () => {
            robotHands.clicOnkCheckOut();
        });



        

    });


});