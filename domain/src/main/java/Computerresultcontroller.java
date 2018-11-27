
    @RestController
    public class ComputeResultController {

        private VoteRepository voteRepository;

        @Autowired
        public ComputeResultController(VoteRepository voteRepository) {
            this.voteRepository = voteRepository;
        }

        @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
        public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
            VoteResult voteResult = new VoteResult();
            Iterable<Vote> allVotes = voteRepository.findVotesByPoll(pollId);

            //TODO: Implement algorithm to count votes
            return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
        }
}
